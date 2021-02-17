package info.xiaomo.server.gate;

import java.io.File;
import info.xiaomo.gengine.common.utils.FileUtil;
import info.xiaomo.gengine.persist.redis.jedis.JedisClusterConfig;
import info.xiaomo.gengine.persist.redis.jedis.JedisManager;
import info.xiaomo.gengine.script.ScriptManager;
import info.xiaomo.server.gate.manager.MongoManager;
import info.xiaomo.server.gate.server.GateServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AppGate {

  private static final Logger LOGGER = LoggerFactory.getLogger(AppGate.class);

  private static String configPath;
  static JedisManager redisManager;
  private static GateServer gateServer;

  private AppGate() {}

  public static void main(String[] args) {
    initConfigPath();

    // redis
    JedisClusterConfig jedisClusterConfig =
        FileUtil.getConfigXML(configPath, "jedisClusterConfig.xml", JedisClusterConfig.class);
    if (jedisClusterConfig == null) {
      LOGGER.error("redis配置{}未找到", configPath);
      System.exit(1);
    }
    redisManager = new JedisManager(jedisClusterConfig);

    // 创建mongodb连接
    MongoManager.getInstance().createConnect(configPath);

    // 加载脚本
    ScriptManager.getInstance().init(null);

    // 通信服务
    gateServer = new GateServer();
    new Thread(gateServer).start();
  }

  private static void initConfigPath() {
    File file = new File(System.getProperty("user.dir"));
    if ("target".equals(file.getName())) {
      configPath = file.getPath() + File.separatorChar + "config";
    } else {
      configPath = file.getPath() + File.separatorChar + "target" + File.separatorChar + "config";
    }
    LOGGER.info("配置路径为：" + configPath);
  }

  public static String getConfigPath() {
    return configPath;
  }

  public static GateServer getHallServer() {
    return gateServer;
  }
}