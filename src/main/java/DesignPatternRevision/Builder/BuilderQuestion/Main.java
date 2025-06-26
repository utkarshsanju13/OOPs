package DesignPatternRevision.Builder.BuilderQuestion;

public class Main {

    public static void main(String[] args) {

        MessageBuilder messageBuilder = MessageBuilder.getBuilder().setMessageType(MessageType.IMAGE)
                .setContent("jjkk")
                .setDelivered(true)
//                .setRecipient("vbnm")
                .build();
    }
}
