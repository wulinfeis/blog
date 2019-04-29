package com.bjsxt.mianshi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;

import javax.imageio.ImageIO;

import com.cupd.dbank.demo.util.TimeUtil;
import com.cupd.dbank.model.Properties;
import com.cupd.dbank.util.SFTPKit;
import com.cupd.dbank.util.StringUtil;

import net.sf.json.JSONObject;
import sun.misc.BASE64Decoder;

public class FileCreatesTwo {

	public static void main(String[] args) {
 
	    BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_INT_BGR);
 
	    String path = "D:\\";
	    
	    
	    File outFiles = new File(path+"ImagePathTest");
	    
	   
	    
	    String imageUrl = path+"ImagePathTest/"+"20190466"+".jpg";
	    
	    final File file = new File(imageUrl);
	    
	    //判断文件目录是否存在，不存在，创建一个
	    if(!outFiles.exists()) {
			outFiles.mkdirs();
		}
	    
	    try {
	    	//如果文件存在，就删除文件，重新创建一个新的文件
	    	if(file.exists()) {
		    	file.delete();
		    	file.createNewFile();
	    	}
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	    
	    
		writeImage(bi, "jpg", file);
		System.out.println("绘图成功");
		
	}
	
	/** 通过指定参数写一个图片  */
    public static boolean writeImage(BufferedImage bi, String picType, File file) {
        
    	Graphics g = bi.getGraphics();
        
        g.setColor(new Color(12, 123, 88));
        g.drawLine(0, 100, 100, 100);
        g.dispose();
        boolean val = false;
        try {
            val = ImageIO.write(bi, picType, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return val;
    }
    
    
    
    //直销银行 图片写入系统的方法
    public JSONObject writeImg(Map<String, String> reqJson) {
		String type = reqJson.get("type");
		String imgStr = reqJson.get("imgStr");
		String cardNbr = reqJson.get("CARDNBR");
		Object idno=reqJson.get("idNo");//正反面 1.正面 2.反面
		JSONObject rst = JSONObject.fromObject("{}");
		String path="";//图片保存路径
		String imgUrl="";//图片打开路径
		String createUrl="";
		
		String date = "";
		
		File outFiles = new File(path +"/ocr/" + date);
		if(!outFiles.exists()){
			outFiles.mkdirs();
		}
	
		if("1".equals(type)){
//			createUrl=path  + "/IF_" + idno + "0" + type + StringUtil.todayStr("yyyyMMdd") + ".png";
			
//			createUrl=path +"/camera/" + idno + "/" + "/IF_" + idno + "0" + type + StringUtil.todayStr("yyyyMMdd") + ".png";
			createUrl=path +"/ocr/" + date + "/" + "/IF_" + idno + "0" + type + ".png";
		}else if ("2".equals(type)){
//			createUrl=path  + "/IB_" + idno + "0" + type + StringUtil.todayStr("yyyyMMdd") + ".png";
//			createUrl=path +"/camera/" + idno + "/" + "/IB_" + idno + "0" + type + StringUtil.todayStr("yyyyMMdd") + ".png";
			createUrl=path +"/ocr/" + date + "/" + "/IB_" + idno + "0" + type + ".png";
		}
		
		// 创建文件夹
		if (createFile(path)) {
			File outFile = new File(createUrl);
			// 判断文件是否存在
			if (outFile.exists()) {
				outFile.delete();
			} else {
				try {
					outFile.createNewFile();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (imgStr == null) {
				// 图像数据为空
				return null;
			}
			BASE64Decoder decoder = new BASE64Decoder();
			// Base64解码
			byte[] b2 = null;
			try {
				b2 = decoder.decodeBuffer(imgStr);
				for (int i = 0; i < b2.length; ++i) {
					if (b2[i] < 0) {// 调整异常数据
						b2[i] += 256;
					}
				}
				
				// 生成图片
				FileOutputStream sout = new FileOutputStream(outFile);
				sout.write(b2);
				sout.flush();
				sout.close();
			  
				rst.put("type", type);
				if("1".equals(type)){
//					  rst.put("URL", imgUrl+"/IF_" + idno + "0" + type + StringUtil.todayStr("yyyyMMdd") + ".png");
//					  createUrl=path  + "IF_" + idno + "0" + type  + StringUtil.todayStr("yyyyMMdd") + ".png";
					
					rst.put("URL", imgUrl+"/ocr/" + date+"/IF_" + idno + "0" + type + ".png");
					createUrl=path +"/ocr/" + date + "/" + "/IF_" + idno + "0" + type + ".png";
				}else if ("2".equals(type)){
//					  rst.put("URL", imgUrl+"/IB_" + idno + "0" + type + StringUtil.todayStr("yyyyMMdd") + ".png");
//					  createUrl=path + "IB_" + idno + "0" + type  + StringUtil.todayStr("yyyyMMdd") + ".png";
					
					rst.put("URL", imgUrl+"/ocr/" + date+"/IB_" + idno + "0" + type  + ".png");
					createUrl=path +"/ocr/" + date + "/" + "/IB_" + idno + "0" + type + ".png";
					
				}
				rst.put("file", createUrl);
				responseSuccess(rst, "图片生成成功");
				
				
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else {
			responseFailure(rst, "0", "图片保存失败");
		}
		return rst;
	}
	
	
	
	// 创建单个文件
		public static boolean createFile(String filePath) {
			File file = new File(filePath);
			if (file.exists()) {// 判断文件是否存在
				System.out.println("目标文件已存在" + filePath);
				return true;
			}
			if (filePath.endsWith(File.separator)) {// 判断文件是否为目录
				System.out.println("目标文件不能为目录！");
				return false;
			}
			if (!file.getParentFile().exists()) {// 判断目标文件所在的目录是否存在
				// 如果目标文件所在的文件夹不存在，则创建父文件夹
				System.out.println("目标文件所在目录不存在，准备创建它！");
				if (!file.getParentFile().mkdirs()) {// 判断创建目录是否成功
					System.out.println("创建目标文件所在的目录失败！");
					return false;
				}
			}
			try {
				if (file.createNewFile()) {// 创建目标文件
					System.out.println("创建文件成功:" + filePath);
					return true;
				} else {
					System.out.println("创建文件失败！");
					return false;
				}
			} catch (IOException e) {// 捕获异常
				e.printStackTrace();
				System.out.println("创建文件失败！" + e.getMessage());
				return false;
			}
		}
}
