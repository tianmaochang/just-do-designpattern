package com.now.decorator;

/**
 * @Desc 装饰者类
 * @Author TMAC
 * @Date 2019/11/7
 * @Version 1.00
 */
public abstract class PacketDecorator implements IPacketCreator {
    IPacketCreator component = null;

    public PacketDecorator(IPacketCreator creator){
        component = creator;
    }
}
