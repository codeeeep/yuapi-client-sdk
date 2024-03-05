package io.github.codeeeep.client;

import lombok.AllArgsConstructor;

/**
 * 在这里进行配置，简化用户配置流程
 */
@AllArgsConstructor
public class YuApiClient {

    private String apiKey;

    /**
     * 这里直接可以调用 api 类的 controller 相关接口，直接对接
     * @param name 用户名称
     * @return 修饰的用户名称
     */
    public String getName(String name) {
        return "hello" + name;
    }


}
