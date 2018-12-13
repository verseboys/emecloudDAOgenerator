package com.wellhome.groud.generator;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;
/**
 * 
 * @author Administrator
 *
 */
public class myClass {

	public static  void  main(String args[]){


		Schema schema=new Schema(1,"com.wellhome.groud");


		//用户表
		
		Entity user=schema.addEntity("User");
		user.addIdProperty();
		user.addStringProperty("userPhone").unique();
		user.addStringProperty("userPassword");
		user.addStringProperty("userName");
		user.addStringProperty("userGender");
		user.addIntProperty("userDistrict");
		user.addDateProperty("userBirth");
		user.addDateProperty("userSignature");
		user.addIntProperty("volunteerSign");
		user.addIntProperty("localId");       
		Property roleId =user.addLongProperty("roleId").getProperty();
		user.addIntProperty("identifyId");
		user.addIntProperty("healRecId");
		user.addStringProperty("userPic");
		


		//answers表
		Entity answers=schema.addEntity("Answers");
		answers.addIntProperty("ansId").primaryKey();
		answers.addStringProperty("userId");
		answers.addDateProperty("choiceId");
		answers.addStringProperty("userGender");
		answers.addIntProperty("uuserAnswer");


		//choices表
		Entity choices=schema.addEntity("Choices");
		choices.addIntProperty("choiceId");
		choices.addIntProperty("examId");
		choices.addStringProperty("chioceContext");
		choices.addStringProperty("chioceAnswer");
		choices.addStringProperty("chioceOpta");
		choices.addStringProperty("chioceOptb");


		//cities表
		Entity cities=schema.addEntity("Cities");
		cities.addIntProperty("cityId");
		cities.addIntProperty("provinceId");
		cities.addStringProperty("cityName");

		//collectcs表
		Entity collectcs=schema.addEntity("Collectcs");
		collectcs.addIntProperty("collectId");
		collectcs.addStringProperty("collectUser");
		collectcs.addIntProperty("collectknowId");
		collectcs.addDateProperty("collectTime");

		//districts表
		Entity districts=schema.addEntity("Districts");
		districts.addIntProperty("districtId");
		districts.addIntProperty("cityId");
		districts.addStringProperty("districtName");

		//Emeknow表
		Entity emeknow=schema.addEntity("Emeknow");
		emeknow.addIntProperty("emeknowId");
		emeknow.addIntProperty("topId");
		emeknow.addStringProperty("emeknowTitle");
		emeknow.addStringProperty("emeknowContent");
		emeknow.addDateProperty("emeknowRelatime");
		emeknow.addStringProperty("userPhone");
		emeknow.addStringProperty("emeknowPic");


		//Emercontact表
		Entity emercontact=schema.addEntity("Emercontact");
		emercontact.addIntProperty("emeconId");
		emercontact.addStringProperty("userPhone");
		emercontact.addStringProperty("emeconName");
		emercontact.addStringProperty("emeconPhone");

		//Examinations表
		Entity examinations=schema.addEntity("Examinations");
		examinations.addIntProperty("examId");
		examinations.addStringProperty("examName");


		//healthrecord表
		Entity healthrecord=schema.addEntity("Healthrecord");
		healthrecord.addIntProperty("healrecId");
		healthrecord.addStringProperty("healrecName");
		healthrecord.addStringProperty("healrecBlood");
		healthrecord.addStringProperty("healrecDisease");
		healthrecord.addStringProperty("healrecAllergic");


		//identification表
		Entity identification=schema.addEntity("Identification");
		identification.addIntProperty("identifId");
		identification.addStringProperty("identifyName");
		identification.addStringProperty("identifyCard");


		//locals表
		Entity locals=schema.addEntity("Locals");
		locals.addIntProperty("localId");
		locals.addDateProperty("localTime");
		locals.addStringProperty("localGpsla");
		locals.addStringProperty("localGpslo");
		locals.addStringProperty("userPhone");


		//provinces表
		Entity provinces=schema.addEntity("Provinces");
		provinces.addIntProperty("provinceId");
		provinces.addStringProperty("provinceName");


		//role表
		Entity role=schema.addEntity("Role");
		role.addIdProperty();
		role.addStringProperty("roleName");

		//scores表
		Entity scores=schema.addEntity("Scores");
		scores.addIntProperty("examI");
		scores.addIntProperty("score");
		scores.addStringProperty("userphone");


		//topics表
		Entity topics=schema.addEntity("Topics");
		topics.addIntProperty("topId");
		topics.addStringProperty("topName");
		topics.addStringProperty("topPic");



		//Dynamic表
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
		
		//用户表和角色表多对一关系
		user.addToOne(role, roleId);
		role.addToMany(user, roleId).setName("users");
		













		try {
			new DaoGenerator().generateAll(schema,"src/main/java");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
