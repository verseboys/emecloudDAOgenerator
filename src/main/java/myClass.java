import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;

public class myClass {

    public static  void  main(String args[]){


        Schema schema=new Schema(1,"com.wellhome.groud");


        //用户表
        Entity user=schema.addEntity("User");
        user.addStringProperty("userPhone");
        user.addStringProperty("userPassword");
        user.addStringProperty("userName");
        user.addStringProperty("userGender");
        user.addIntProperty("userDistrict");
        user.addDateProperty("userBirth");
        user.addDateProperty("userSignature");
        user.addIntProperty("volunteerSign");
        user.addIntProperty("localId");
        user.addIntProperty("roseId");
        user.addIntProperty("identifyId");
        user.addIntProperty("healRecId");


        //急救知识表
        Entity emeknow=schema.addEntity("Emeknow");
        emeknow.addIntProperty("emeKnowId");
        emeknow.addIntProperty("topId");












        try {
            new DaoGenerator().generateAll(schema,"src/main/java");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
