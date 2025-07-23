package com.sq.common_module.common.utils.java;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.Date;

/**
 * Created by yangshuai on 2018/7/17.
 */

public class FileUtil {

    //bitmap转file
    //漏洞描述：发现调用getExternalStorageDirectory，存储内容到SD卡可以被任意程序访问，存在安全隐患。
//    public static File bitmapToFile(Bitmap bitmap) {
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, baos);
//        File file = new File(Environment.getExternalStorageDirectory() + "/temp.jpg");
//        try {
//            file.createNewFile();
//            FileOutputStream fos = new FileOutputStream(file);
//            InputStream is = new ByteArrayInputStream(baos.toByteArray());
//            int x = 0;
//            byte[] b = new byte[1024 * 100];
//            while ((x = is.read(b)) != -1) {
//                fos.write(b, 0, x);
//            }
//            fos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return file;
//    }

    //获得文件的MD5
    public static String getFileMD5(File file) {
        if (!file.isFile()) {
            return null;
        }
        MessageDigest digest = null;
        FileInputStream in = null;
        byte buffer[] = new byte[1024];
        int len;
        try {
            digest = MessageDigest.getInstance("md5");
            in = new FileInputStream(file);
            while ((len = in.read(buffer, 0, 1024)) != -1) {
                digest.update(buffer, 0, len);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return bytesToHexString(digest.digest()).toLowerCase();
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }


//    public static synchronized String getTenFileName() {
//        String name = TimeUtil.getTimeBIZ(new Date()) + NumUtil.getTenDigitsRandomNum();
//        return Md5Util.getMd5(name);
//    }


    /*
        * Java文件操作 获取文件扩展名
        * */
    public static String getExtensionName(String filename) {
        if ((filename != null) && (filename.length() > 0)) {
            int dot = filename.lastIndexOf('.');
            if ((dot > -1) && (dot < (filename.length() - 1))) {
                return filename.substring(dot + 1);
            }
        }
        return filename;
    }


    public static boolean fileSizeIsAvail(long fSize) {

        long size = Long.valueOf("34359738368");
        if (fSize > size) {
            return false;

        } else {
            return true;
        }

    }

    public static Bitmap urlToBitmap(String url) {
        Bitmap bm = null;
        try {
            URL iconUrl = new URL(url);
            URLConnection conn = iconUrl.openConnection();
            HttpURLConnection http = (HttpURLConnection) conn;

            int length = http.getContentLength();

            conn.connect();
            // 获得图像的字符流
            InputStream is = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is, length);
            bm = BitmapFactory.decodeStream(bis);
            bis.close();
            is.close();// 关闭流
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return bm;
    }
}
