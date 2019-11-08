package com.now.decorator;

/**
 * @Desc
 * @Author TMAC
 * @Date 2019/11/7
 * @Version 1.00
 */
public class PacketHTTPHeaderCreator extends PacketDecorator {
    public PacketHTTPHeaderCreator(IPacketCreator creator){
        super(creator);
    }

    @Override
    public String handleContent() {
        return component.handleContent() + " by HTTP";
    }
}
