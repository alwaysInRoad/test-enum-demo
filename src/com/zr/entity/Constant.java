package com.zr.entity;
/**
 * 仅用于测试类，从实际项目中抽出来的
 * @author zr
 *
 */
public class Constant {
	/**
	 * 参数校验枚举类
	 * @author zr
	 *
	 */
	 public static enum ResultObjectType {
	    	//成功
	        SUCC(0),
	        //失败,异常
	        ERROR(1),
	        //参数错误
	        PARAMERROR(2),
	    	//数据为空
	        NODATA(9);
	        private Integer value;

	        private ResultObjectType(Integer value) {
	            this.value = value;
	        }

	        public Integer getDesc() {
	            return this.value;
	        }

	    }
	/**
	  * 参数校验枚举类
	  * @author zr
	  * @date 2018年9月17日
	  */
	 public static enum ParamValidate {
		 CheckLength("checkLength",0),
		 IsAccId("IsAccId",1),
		 IsAge("IsAge",2),
		 IsEmail("IsEmail",3),
		 IsIdCard("IsIdCard",4),
		 IsPhoneNo("IsPhoneNo",5),
		 IsPostCode("IsPostCode",6),
		 IsPwd("IsPwd",7);
		 // 成员变量
        private String desc;
        private int index;

        // 构造方法
        private ParamValidate(String name, int index) {
            this.desc = name;
            this.index = index;
        }

        // 覆盖方法
        @Override
        public String toString() {
            return this.index + "_" + this.desc;
        }

		 public String getDesc() {
		  	 return desc;
		 }

		 public void setDesc(String desc) {
			 this.desc = desc;
		 }

		 public int getIndex() {
			 return index;
		 }

		 public void setIndex(int index) {
			 this.index = index;
		 }
	 } 
	
}
