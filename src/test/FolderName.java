package test;

import java.io.File;

/**
 * 要求输入一个文件夹绝对路径，控制台输出该文件夹下的所有文件，以及子文件夹下的所有文件
 * 
 * @author liurenyou
 *
 */

public class FolderName {
	public static void main(String[] args) {
		String path = "/Users/liurenyou/Documents/求职";
		getAllFileName(path, null);
	}

	public static void getAllFileName(String path, StringBuffer name) {
		File f = new File(path);
		if (f.isFile()) {
			System.out.println("该路径为文件");
			return;
		} else {
			String[] fileNames = f.list();
			File[] files = f.listFiles();
			StringBuffer folderName = new StringBuffer();
			folderName.append(name).append("/").append(f.getName());
			System.out.println("--------" + folderName.substring(5) + "--------");
			for (String s : fileNames) {
				System.out.println(s);
			}
			for (File a : files) {
				if (a.isDirectory()) {
					getAllFileName(a.toString(), folderName);
				}
			}
		}
	}
}
