package com.wellhome.groud.generator;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;
/**
 * 第二版 
 * @author Administrator
 *
 */
public class myClass2 {

	public static  void  main(String args[]){

        //生成安卓持久层代码的目录  dao pojo
		Schema schema=new Schema(1,"com.wellhome.groud1");


		//用户表

		Entity user=schema.addEntity("User");
		user.addIdProperty();
		user.addLongProperty("weiId");
		user.addLongProperty("heaId");
		user.addLongProperty("disId");
		user.addIntProperty("ideId");
		Property roleId =user.addLongProperty("rolId").getProperty();
		user.addStringProperty("userPhone").unique();
		user.addStringProperty("userPassword");
		user.addStringProperty("userName");
		user.addStringProperty("userGender");
		user.addDateProperty("userBirth");
		user.addStringProperty("userSignature");
		user.addIntProperty("volunteerSign");
		user.addStringProperty("userPic");










		/*
		//answers表
		Entity answers=schema.addEntity("Answers");
		answers.addIntProperty("ansId").primaryKey();
		answers.addStringProperty("userId");
		answers.addDateProperty("choiceId");
		answers.addStringProperty("userGender");
		answers.addIntProperty("uuserAnswer");*/


		/*		//choices表
		Entity choices=schema.addEntity("Choices");
		choices.addIntProperty("choiceId");
		choices.addIntProperty("examId");
		choices.addStringProperty("chioceContext");
		choices.addStringProperty("chioceAnswer");
		choices.addStringProperty("chioceOpta");
		choices.addStringProperty("chioceOptb");*/


		//cities表
		Entity cities=schema.addEntity("Cities");
		cities.addIdProperty();
		cities.addIntProperty("proId");
		cities.addStringProperty("cityName");

		/*		//collectcs表
		Entity collectcs=schema.addEntity("Collectcs");
		collectcs.addIntProperty("collectId");
		collectcs.addStringProperty("collectUser");
		collectcs.addIntProperty("collectknowId");
		collectcs.addDateProperty("collectTime");*/

		//districts表
		Entity districts=schema.addEntity("Districts");
		districts.addIdProperty();
		districts.addLongProperty("cityId");
		districts.addStringProperty("districtName");

		//Emeknow表
		Entity emeknow=schema.addEntity("Emeknow");
		emeknow.addIdProperty();
		emeknow.addLongProperty("topId");
		emeknow.addLongProperty("userId");
		emeknow.addStringProperty("emeknowTitle");
		emeknow.addStringProperty("emeknowContent");
		emeknow.addDateProperty("emeknowTime");
		emeknow.addStringProperty("emeknowPic");


		//feedback表
		Entity feedback=schema.addEntity("Feedback");
		feedback.addIdProperty();
		feedback.addStringProperty("feedContent");
		feedback.addIntProperty("feedActive");
		feedback.addIntProperty("feedTime");
		feedback.addStringProperty("feedSubno");



		//Emercontact表
		Entity emercontact=schema.addEntity("Emercontact");
		emercontact.addIdProperty();
		emercontact.addLongProperty("userId");
		emercontact.addStringProperty("emeconName");
		emercontact.addStringProperty("emeconPhone");

		/*		//Examinations表
		Entity examinations=schema.addEntity("Examinations");
		examinations.addIntProperty("examId");
		examinations.addStringProperty("examName");*/


		//healthrecord表
		Entity healthrecord=schema.addEntity("Healthrecord");
		healthrecord.addIdProperty();
		healthrecord.addLongProperty("useId");
		healthrecord.addStringProperty("healrecName");
		healthrecord.addStringProperty("healrecBlood");
		healthrecord.addStringProperty("healrecDisease");
		healthrecord.addStringProperty("healrecAllergic");
		healthrecord.addStringProperty("healrecAllergicOther");

		//identification表
		Entity identification=schema.addEntity("Identification");
		identification.addIdProperty();
		identification.addLongProperty("useId");
		identification.addStringProperty("identifyName");
		identification.addStringProperty("identifyCard");


		//location表
		Entity location=schema.addEntity("Location");
		location.addIdProperty();
		Property useId =location.addLongProperty("useId").getProperty();
		//location.addLongProperty("useId");
		location.addDateProperty("localTime");
		location.addStringProperty("localGpsla");
		location.addStringProperty("localGpslo");



		//provinces表
		Entity provinces=schema.addEntity("Provinces");
		provinces.addIdProperty();
		provinces.addStringProperty("provinceName");


		//role表
		Entity role=schema.addEntity("Role");
		role.addIdProperty();
		role.addStringProperty("roleName");

		/*		//scores表
		Entity scores=schema.addEntity("Scores");
		scores.addIntProperty("examI");
		scores.addIntProperty("score");
		scores.addStringProperty("userphone");
		 */

		//topics表
		Entity topics=schema.addEntity("Topics");
		topics.addIdProperty();
		topics.addStringProperty("topicName");
		topics.addStringProperty("topicPic");




		//News topics表
		Entity newsType=schema.addEntity("NewsType");
		newsType.addIntProperty("newsTypeId");
		newsType.addStringProperty("typeName");




		//News 表
		Entity news=schema.addEntity("News");
		news.addIntProperty("newsId");
		news.addStringProperty("title");
		news.addStringProperty("content");
		news.addDateProperty("publishDate");
		news.addStringProperty("author");
        news.addIntProperty("typeId");
        news.addIntProperty("click");
		news.addIntProperty("isHead");
		news.addIntProperty("isImage");
		news.addStringProperty("imageName");
		news.addIntProperty("isHot");
		
		
		
		//News comment表
				Entity comment=schema.addEntity("Comment");
				comment.addIntProperty("commentId");
				comment.addIntProperty("newsId");
				comment.addStringProperty("content");
				comment.addStringProperty("userIP");
				comment.addDateProperty("commentDate");
				comment.addLongProperty("userId");
		
				
				//EmeArea表
				Entity emeArea=schema.addEntity("EmeArea");
				emeArea.addIdProperty();
				emeArea.addStringProperty("areaID");
				emeArea.addStringProperty("area");
				emeArea.addStringProperty("father");
			
				//News comment表
				Entity emeCity=schema.addEntity("EmeCity");
				emeCity.addIdProperty();
				emeCity.addStringProperty("cityID");
				emeCity.addStringProperty("city");
				emeCity.addStringProperty("father");
				
				//News comment表
				Entity emeProvince=schema.addEntity("EmeProvince");
				emeProvince.addIdProperty();
				emeProvince.addStringProperty("provinceID");
				emeProvince.addStringProperty("province");
				
				
	
		/*		//Dynamic表
		Entity dynamic=schema.addEntity("Dynamic");
		dynamic.addIdProperty();
		Property userId =dynamic.addLongProperty("userId").getProperty();
		dynamic.addDateProperty("csTime");
		dynamic.addStringProperty("csContent");
		dynamic.addStringProperty("dynamicPic");


		//Comments表
		Entity comments=schema.addEntity("Comments");
		comments.addIntProperty("commitId");
		comments.addIntProperty("csId");
		comments.addDateProperty("commitTime");
		comments.addStringProperty("commitContent");
		comments.addStringProperty("commitUserId");



		//用户表和动态表一对多关系
		user.addToMany(dynamic, userId).setName("dynamics");
		dynamic.addToOne(user, userId);
		 */

		//用户表和角色表多对一关系
		user.addToOne(role, roleId);
		role.addToMany(user, roleId).setName("users");



		//用户表和位置表一对多关系
		user.addToMany(location, useId);
		location.addToOne(user, useId).setName("users");













		try {
			new DaoGenerator().generateAll(schema,"src/main/java");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
