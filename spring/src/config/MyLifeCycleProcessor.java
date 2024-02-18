package config;

import org.springframework.context.SmartLifecycle;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 14:55 2023/1/21
 * @Modified By
 */
public class MyLifeCycleProcessor implements SmartLifecycle {
    @Override
    public void start() {
        System.out.println("项目已启动,applicationContext构建成功");
    }

    @Override
    public void stop() {
        System.out.println("项目已结束,applicationContext已销毁");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
