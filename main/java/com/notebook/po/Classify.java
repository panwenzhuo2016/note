package com.notebook.po;
import java.io.Serializable;


/**
 *
 *
 *
 **/

/**
 * @author 潘文卓
 * 时间:Mon Nov 13 17:00:38 CST 2017
 * 表 classify
 **/public class Classify extends BaseEntity  implements Serializable {

	/****/
	private String id;
	/****/
	private String classifyName;
	/****/
	private String sort;


	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return this.id;
	}

	public void setClassifyName(String classifyName){
		this.classifyName = classifyName;
	}

	public String getClassifyName(){
		return this.classifyName;
	}

	public void setSort(String sort){
		this.sort = sort;
	}

	public String getSort(){
		return this.sort;
	}

}
