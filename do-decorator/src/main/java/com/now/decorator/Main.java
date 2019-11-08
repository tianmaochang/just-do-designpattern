package com.now.decorator;

/**
 * @Desc 测试主类
 * @Author TMAC
 * @Date 2019/11/7
 * @Version 1.00
 */
public class Main {
    public static void main(String[] args) {
        IPacketCreator creator = new PacketHTTPHeaderCreator(
                new PacketHTMLHeaderCreator(
                        new PacketBodyCreator()));
        System.out.println(creator.handleContent());
    }
}
