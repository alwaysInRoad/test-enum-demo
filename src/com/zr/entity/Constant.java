package com.zr.entity;
/**
 * �����ڲ����࣬��ʵ����Ŀ�г������
 * @author zr
 *
 */
public class Constant {
	/**
	 * ����У��ö����
	 * @author zr
	 *
	 */
	 public static enum ResultObjectType {
	    	//�ɹ�
	        SUCC(0),
	        //ʧ��,�쳣
	        ERROR(1),
	        //��������
	        PARAMERROR(2),
	    	//����Ϊ��
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
	  * ����У��ö����
	  * @author zr
	  * @date 2018��9��17��
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
		 // ��Ա����
        private String desc;
        private int index;

        // ���췽��
        private ParamValidate(String name, int index) {
            this.desc = name;
            this.index = index;
        }

        // ���Ƿ���
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
