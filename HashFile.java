import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class HashFile {
    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        byte[] buffer = new byte[1024];// 用于计算hash值的文件缓冲区
        MessageDigest complete = MessageDigest.getInstance("SHA-1");// 使用SHA1哈希/摘要算法
        int numRead = 0;
        do {
            numRead = is.read(buffer);// 读出numRead字节到buffer中
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);// 根据buffer[0:numRead]的内容更新hash值
            }
        } while (numRead != -1);// 文件已读完，退出循环
        is.close();// 关闭输入流
        return complete.digest();// 返回SHA1哈希值
    }

    public static void dfs(String path) {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        int a = fs.length;
        String array = "";
        for(int i = 0; i < a; i++) {
            if(fs[i].isFile()) {
                try{
                    FileInputStream is = new FileInputStream(fs[i]);
                    byte[] sha1 = SHA1Checksum(is);
                    String result = "";
                    for (int j = 0; j < sha1.length; j++) {
                        result += Integer.toString(sha1[j], 16);
                    }
                    System.out.println("The Hash of "+ fs[i].getName() + " is " + result);
                    array = array + fs[i].getName() + ": " + result + "\n";
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                dfs(path + File.separator + fs[i].getName());
            }
        }
        try{
            byte[] directory = array.getBytes();
            MessageDigest complete = MessageDigest.getInstance("SHA-1");
            complete.update(directory);
            byte[] sha1 = complete.digest();
            String result = "";
            for (int j = 0; j < sha1.length; j++) {
                result += Integer.toString(sha1[j], 16);
            }
            System.out.println("The Hash of directory is " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            String path = "D:\\Java\\homework1105\\test";
            dfs(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
