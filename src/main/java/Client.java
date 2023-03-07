
// generate code proto  protoc -I=/mnt/c/Users/gwend/IdeaProjects/TestgRPC2/src/main/java/ --java_out=/mnt/c/Users/gwend/IdeaProjects/TestgRPC2/src/main/java/ /mnt/c/Users/gwend/IdeaProjects/TestgRPC2/src/main/java/test.proto
public class Client {
    public static void main(String[] args) {
        System.out.println("Bonjour");
       HelloWorld test= HelloWorld.newBuilder().setAge(14).setSize(14).setStrHello("Bonjour").setWeight(45).build();
    }
}
