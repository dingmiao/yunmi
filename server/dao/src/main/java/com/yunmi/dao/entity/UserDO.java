package com.yunmi.dao.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class UserDO implements Serializable {

    private static final long serialVersionUID = 1631344943140L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private String phoneNum;

    /**
    * 
    * isNullAble:1
    */
    private String password;

    /**
    * 
    * isNullAble:1
    */
    private String wxOpenId;

    /**
    * 
    * isNullAble:1
    */
    private Integer exLevel;

    /**
    * 
    * isNullAble:1
    */
    private String nickName;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setPhoneNum(String phoneNum){this.phoneNum = phoneNum;}

    public String getPhoneNum(){return this.phoneNum;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setWxOpenId(String wxOpenId){this.wxOpenId = wxOpenId;}

    public String getWxOpenId(){return this.wxOpenId;}

    public void setExLevel(Integer exLevel){this.exLevel = exLevel;}

    public Integer getExLevel(){return this.exLevel;}

    public void setNickName(String nickName){this.nickName = nickName;}

    public String getNickName(){return this.nickName;}
    @Override
    public String toString() {
        return "UserDO{" +
                "id='" + id + '\'' +
                "phoneNum='" + phoneNum + '\'' +
                "password='" + password + '\'' +
                "wxOpenId='" + wxOpenId + '\'' +
                "exLevel='" + exLevel + '\'' +
                "nickName='" + nickName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UserDO set;

        private ConditionBuilder where;

        public UpdateBuilder set(UserDO set){
            this.set = set;
            return this;
        }

        public UserDO getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends UserDO{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> phoneNumList;

        public List<String> getPhoneNumList(){return this.phoneNumList;}


        private List<String> fuzzyPhoneNum;

        public List<String> getFuzzyPhoneNum(){return this.fuzzyPhoneNum;}

        private List<String> rightFuzzyPhoneNum;

        public List<String> getRightFuzzyPhoneNum(){return this.rightFuzzyPhoneNum;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> wxOpenIdList;

        public List<String> getWxOpenIdList(){return this.wxOpenIdList;}


        private List<String> fuzzyWxOpenId;

        public List<String> getFuzzyWxOpenId(){return this.fuzzyWxOpenId;}

        private List<String> rightFuzzyWxOpenId;

        public List<String> getRightFuzzyWxOpenId(){return this.rightFuzzyWxOpenId;}
        private List<Integer> exLevelList;

        public List<Integer> getExLevelList(){return this.exLevelList;}

        private Integer exLevelSt;

        private Integer exLevelEd;

        public Integer getExLevelSt(){return this.exLevelSt;}

        public Integer getExLevelEd(){return this.exLevelEd;}

        private List<String> nickNameList;

        public List<String> getNickNameList(){return this.nickNameList;}


        private List<String> fuzzyNickName;

        public List<String> getFuzzyNickName(){return this.fuzzyNickName;}

        private List<String> rightFuzzyNickName;

        public List<String> getRightFuzzyNickName(){return this.rightFuzzyNickName;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyPhoneNum (List<String> fuzzyPhoneNum){
            this.fuzzyPhoneNum = fuzzyPhoneNum;
            return this;
        }

        public QueryBuilder fuzzyPhoneNum (String ... fuzzyPhoneNum){
            this.fuzzyPhoneNum = solveNullList(fuzzyPhoneNum);
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNum (List<String> rightFuzzyPhoneNum){
            this.rightFuzzyPhoneNum = rightFuzzyPhoneNum;
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNum (String ... rightFuzzyPhoneNum){
            this.rightFuzzyPhoneNum = solveNullList(rightFuzzyPhoneNum);
            return this;
        }

        public QueryBuilder phoneNum(String phoneNum){
            setPhoneNum(phoneNum);
            return this;
        }

        public QueryBuilder phoneNumList(String ... phoneNum){
            this.phoneNumList = solveNullList(phoneNum);
            return this;
        }

        public QueryBuilder phoneNumList(List<String> phoneNum){
            this.phoneNumList = phoneNum;
            return this;
        }

        public QueryBuilder fetchPhoneNum(){
            setFetchFields("fetchFields","phoneNum");
            return this;
        }

        public QueryBuilder excludePhoneNum(){
            setFetchFields("excludeFields","phoneNum");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }

        public QueryBuilder fuzzyWxOpenId (List<String> fuzzyWxOpenId){
            this.fuzzyWxOpenId = fuzzyWxOpenId;
            return this;
        }

        public QueryBuilder fuzzyWxOpenId (String ... fuzzyWxOpenId){
            this.fuzzyWxOpenId = solveNullList(fuzzyWxOpenId);
            return this;
        }

        public QueryBuilder rightFuzzyWxOpenId (List<String> rightFuzzyWxOpenId){
            this.rightFuzzyWxOpenId = rightFuzzyWxOpenId;
            return this;
        }

        public QueryBuilder rightFuzzyWxOpenId (String ... rightFuzzyWxOpenId){
            this.rightFuzzyWxOpenId = solveNullList(rightFuzzyWxOpenId);
            return this;
        }

        public QueryBuilder wxOpenId(String wxOpenId){
            setWxOpenId(wxOpenId);
            return this;
        }

        public QueryBuilder wxOpenIdList(String ... wxOpenId){
            this.wxOpenIdList = solveNullList(wxOpenId);
            return this;
        }

        public QueryBuilder wxOpenIdList(List<String> wxOpenId){
            this.wxOpenIdList = wxOpenId;
            return this;
        }

        public QueryBuilder fetchWxOpenId(){
            setFetchFields("fetchFields","wxOpenId");
            return this;
        }

        public QueryBuilder excludeWxOpenId(){
            setFetchFields("excludeFields","wxOpenId");
            return this;
        }

        public QueryBuilder exLevelBetWeen(Integer exLevelSt,Integer exLevelEd){
            this.exLevelSt = exLevelSt;
            this.exLevelEd = exLevelEd;
            return this;
        }

        public QueryBuilder exLevelGreaterEqThan(Integer exLevelSt){
            this.exLevelSt = exLevelSt;
            return this;
        }
        public QueryBuilder exLevelLessEqThan(Integer exLevelEd){
            this.exLevelEd = exLevelEd;
            return this;
        }


        public QueryBuilder exLevel(Integer exLevel){
            setExLevel(exLevel);
            return this;
        }

        public QueryBuilder exLevelList(Integer ... exLevel){
            this.exLevelList = solveNullList(exLevel);
            return this;
        }

        public QueryBuilder exLevelList(List<Integer> exLevel){
            this.exLevelList = exLevel;
            return this;
        }

        public QueryBuilder fetchExLevel(){
            setFetchFields("fetchFields","exLevel");
            return this;
        }

        public QueryBuilder excludeExLevel(){
            setFetchFields("excludeFields","exLevel");
            return this;
        }

        public QueryBuilder fuzzyNickName (List<String> fuzzyNickName){
            this.fuzzyNickName = fuzzyNickName;
            return this;
        }

        public QueryBuilder fuzzyNickName (String ... fuzzyNickName){
            this.fuzzyNickName = solveNullList(fuzzyNickName);
            return this;
        }

        public QueryBuilder rightFuzzyNickName (List<String> rightFuzzyNickName){
            this.rightFuzzyNickName = rightFuzzyNickName;
            return this;
        }

        public QueryBuilder rightFuzzyNickName (String ... rightFuzzyNickName){
            this.rightFuzzyNickName = solveNullList(rightFuzzyNickName);
            return this;
        }

        public QueryBuilder nickName(String nickName){
            setNickName(nickName);
            return this;
        }

        public QueryBuilder nickNameList(String ... nickName){
            this.nickNameList = solveNullList(nickName);
            return this;
        }

        public QueryBuilder nickNameList(List<String> nickName){
            this.nickNameList = nickName;
            return this;
        }

        public QueryBuilder fetchNickName(){
            setFetchFields("fetchFields","nickName");
            return this;
        }

        public QueryBuilder excludeNickName(){
            setFetchFields("excludeFields","nickName");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public UserDO build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> phoneNumList;

        public List<String> getPhoneNumList(){return this.phoneNumList;}


        private List<String> fuzzyPhoneNum;

        public List<String> getFuzzyPhoneNum(){return this.fuzzyPhoneNum;}

        private List<String> rightFuzzyPhoneNum;

        public List<String> getRightFuzzyPhoneNum(){return this.rightFuzzyPhoneNum;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> wxOpenIdList;

        public List<String> getWxOpenIdList(){return this.wxOpenIdList;}


        private List<String> fuzzyWxOpenId;

        public List<String> getFuzzyWxOpenId(){return this.fuzzyWxOpenId;}

        private List<String> rightFuzzyWxOpenId;

        public List<String> getRightFuzzyWxOpenId(){return this.rightFuzzyWxOpenId;}
        private List<Integer> exLevelList;

        public List<Integer> getExLevelList(){return this.exLevelList;}

        private Integer exLevelSt;

        private Integer exLevelEd;

        public Integer getExLevelSt(){return this.exLevelSt;}

        public Integer getExLevelEd(){return this.exLevelEd;}

        private List<String> nickNameList;

        public List<String> getNickNameList(){return this.nickNameList;}


        private List<String> fuzzyNickName;

        public List<String> getFuzzyNickName(){return this.fuzzyNickName;}

        private List<String> rightFuzzyNickName;

        public List<String> getRightFuzzyNickName(){return this.rightFuzzyNickName;}

        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNum (List<String> fuzzyPhoneNum){
            this.fuzzyPhoneNum = fuzzyPhoneNum;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNum (String ... fuzzyPhoneNum){
            this.fuzzyPhoneNum = solveNullList(fuzzyPhoneNum);
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNum (List<String> rightFuzzyPhoneNum){
            this.rightFuzzyPhoneNum = rightFuzzyPhoneNum;
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNum (String ... rightFuzzyPhoneNum){
            this.rightFuzzyPhoneNum = solveNullList(rightFuzzyPhoneNum);
            return this;
        }

        public ConditionBuilder phoneNumList(String ... phoneNum){
            this.phoneNumList = solveNullList(phoneNum);
            return this;
        }

        public ConditionBuilder phoneNumList(List<String> phoneNum){
            this.phoneNumList = phoneNum;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzyWxOpenId (List<String> fuzzyWxOpenId){
            this.fuzzyWxOpenId = fuzzyWxOpenId;
            return this;
        }

        public ConditionBuilder fuzzyWxOpenId (String ... fuzzyWxOpenId){
            this.fuzzyWxOpenId = solveNullList(fuzzyWxOpenId);
            return this;
        }

        public ConditionBuilder rightFuzzyWxOpenId (List<String> rightFuzzyWxOpenId){
            this.rightFuzzyWxOpenId = rightFuzzyWxOpenId;
            return this;
        }

        public ConditionBuilder rightFuzzyWxOpenId (String ... rightFuzzyWxOpenId){
            this.rightFuzzyWxOpenId = solveNullList(rightFuzzyWxOpenId);
            return this;
        }

        public ConditionBuilder wxOpenIdList(String ... wxOpenId){
            this.wxOpenIdList = solveNullList(wxOpenId);
            return this;
        }

        public ConditionBuilder wxOpenIdList(List<String> wxOpenId){
            this.wxOpenIdList = wxOpenId;
            return this;
        }

        public ConditionBuilder exLevelBetWeen(Integer exLevelSt,Integer exLevelEd){
            this.exLevelSt = exLevelSt;
            this.exLevelEd = exLevelEd;
            return this;
        }

        public ConditionBuilder exLevelGreaterEqThan(Integer exLevelSt){
            this.exLevelSt = exLevelSt;
            return this;
        }
        public ConditionBuilder exLevelLessEqThan(Integer exLevelEd){
            this.exLevelEd = exLevelEd;
            return this;
        }


        public ConditionBuilder exLevelList(Integer ... exLevel){
            this.exLevelList = solveNullList(exLevel);
            return this;
        }

        public ConditionBuilder exLevelList(List<Integer> exLevel){
            this.exLevelList = exLevel;
            return this;
        }

        public ConditionBuilder fuzzyNickName (List<String> fuzzyNickName){
            this.fuzzyNickName = fuzzyNickName;
            return this;
        }

        public ConditionBuilder fuzzyNickName (String ... fuzzyNickName){
            this.fuzzyNickName = solveNullList(fuzzyNickName);
            return this;
        }

        public ConditionBuilder rightFuzzyNickName (List<String> rightFuzzyNickName){
            this.rightFuzzyNickName = rightFuzzyNickName;
            return this;
        }

        public ConditionBuilder rightFuzzyNickName (String ... rightFuzzyNickName){
            this.rightFuzzyNickName = solveNullList(rightFuzzyNickName);
            return this;
        }

        public ConditionBuilder nickNameList(String ... nickName){
            this.nickNameList = solveNullList(nickName);
            return this;
        }

        public ConditionBuilder nickNameList(List<String> nickName){
            this.nickNameList = nickName;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private UserDO obj;

        public Builder(){
            this.obj = new UserDO();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder phoneNum(String phoneNum){
            this.obj.setPhoneNum(phoneNum);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder wxOpenId(String wxOpenId){
            this.obj.setWxOpenId(wxOpenId);
            return this;
        }
        public Builder exLevel(Integer exLevel){
            this.obj.setExLevel(exLevel);
            return this;
        }
        public Builder nickName(String nickName){
            this.obj.setNickName(nickName);
            return this;
        }
        public UserDO build(){return obj;}
    }

}
