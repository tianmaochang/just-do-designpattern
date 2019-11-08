package com.now.decorator;

/**
 * @Desc 具体装饰者类
 * @Author TMAC
 * @Date 2019/11/7
 * @Version 1.00
 */
public class PacketHTMLHeaderCreator extends PacketDecorator {
    public  PacketHTMLHeaderCreator(IPacketCreator creator){
        super(creator);
    }

    @Override
    public String handleContent() {
        String content = "Use HTML "+component.handleContent();
        return content;
    }
}
