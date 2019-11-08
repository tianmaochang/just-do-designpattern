package com.now.decorator;

/**
 * @Desc 具体组件类
 * @Author TMAC
 * @Date 2019/11/7
 * @Version 1.00
 */
public class PacketBodyCreator implements IPacketCreator {
    @Override
    public String handleContent() {
        return "Content of packet";
    }
}
