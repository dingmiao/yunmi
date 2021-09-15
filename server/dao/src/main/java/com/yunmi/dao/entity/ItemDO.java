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
public class ItemDO implements Serializable {

    private static final long serialVersionUID = 1631345001862L;


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
    private String title;

    /**
    * 
    * isNullAble:1
    */
    private String pictureURL;

    /**
    * 
    * isNullAble:1
    */
    private String jumpURL;

    /**
    * 
    * isNullAble:1
    */
    private Double price;

    /**
    * 
    * isNullAble:1
    */
    private String info;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setPictureURL(String pictureURL){this.pictureURL = pictureURL;}

    public String getPictureURL(){return this.pictureURL;}

    public void setJumpURL(String jumpURL){this.jumpURL = jumpURL;}

    public String getJumpURL(){return this.jumpURL;}

    public void setPrice(Double price){this.price = price;}

    public Double getPrice(){return this.price;}

    public void setInfo(String info){this.info = info;}

    public String getInfo(){return this.info;}
    @Override
    public String toString() {
        return "ItemDO{" +
                "id='" + id + '\'' +
                "title='" + title + '\'' +
                "pictureURL='" + pictureURL + '\'' +
                "jumpURL='" + jumpURL + '\'' +
                "price='" + price + '\'' +
                "info='" + info + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ItemDO set;

        private ConditionBuilder where;

        public UpdateBuilder set(ItemDO set){
            this.set = set;
            return this;
        }

        public ItemDO getSet(){
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

    public static class QueryBuilder extends ItemDO{
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

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> pictureURLList;

        public List<String> getPictureURLList(){return this.pictureURLList;}


        private List<String> fuzzyPictureURL;

        public List<String> getFuzzyPictureURL(){return this.fuzzyPictureURL;}

        private List<String> rightFuzzyPictureURL;

        public List<String> getRightFuzzyPictureURL(){return this.rightFuzzyPictureURL;}
        private List<String> jumpURLList;

        public List<String> getJumpURLList(){return this.jumpURLList;}


        private List<String> fuzzyJumpURL;

        public List<String> getFuzzyJumpURL(){return this.fuzzyJumpURL;}

        private List<String> rightFuzzyJumpURL;

        public List<String> getRightFuzzyJumpURL(){return this.rightFuzzyJumpURL;}
        private List<Double> priceList;

        public List<Double> getPriceList(){return this.priceList;}

        private Double priceSt;

        private Double priceEd;

        public Double getPriceSt(){return this.priceSt;}

        public Double getPriceEd(){return this.priceEd;}

        private List<String> infoList;

        public List<String> getInfoList(){return this.infoList;}


        private List<String> fuzzyInfo;

        public List<String> getFuzzyInfo(){return this.fuzzyInfo;}

        private List<String> rightFuzzyInfo;

        public List<String> getRightFuzzyInfo(){return this.rightFuzzyInfo;}
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

        public QueryBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public QueryBuilder fuzzyTitle (String ... fuzzyTitle){
            this.fuzzyTitle = solveNullList(fuzzyTitle);
            return this;
        }

        public QueryBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public QueryBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            this.rightFuzzyTitle = solveNullList(rightFuzzyTitle);
            return this;
        }

        public QueryBuilder title(String title){
            setTitle(title);
            return this;
        }

        public QueryBuilder titleList(String ... title){
            this.titleList = solveNullList(title);
            return this;
        }

        public QueryBuilder titleList(List<String> title){
            this.titleList = title;
            return this;
        }

        public QueryBuilder fetchTitle(){
            setFetchFields("fetchFields","title");
            return this;
        }

        public QueryBuilder excludeTitle(){
            setFetchFields("excludeFields","title");
            return this;
        }

        public QueryBuilder fuzzyPictureURL (List<String> fuzzyPictureURL){
            this.fuzzyPictureURL = fuzzyPictureURL;
            return this;
        }

        public QueryBuilder fuzzyPictureURL (String ... fuzzyPictureURL){
            this.fuzzyPictureURL = solveNullList(fuzzyPictureURL);
            return this;
        }

        public QueryBuilder rightFuzzyPictureURL (List<String> rightFuzzyPictureURL){
            this.rightFuzzyPictureURL = rightFuzzyPictureURL;
            return this;
        }

        public QueryBuilder rightFuzzyPictureURL (String ... rightFuzzyPictureURL){
            this.rightFuzzyPictureURL = solveNullList(rightFuzzyPictureURL);
            return this;
        }

        public QueryBuilder pictureURL(String pictureURL){
            setPictureURL(pictureURL);
            return this;
        }

        public QueryBuilder pictureURLList(String ... pictureURL){
            this.pictureURLList = solveNullList(pictureURL);
            return this;
        }

        public QueryBuilder pictureURLList(List<String> pictureURL){
            this.pictureURLList = pictureURL;
            return this;
        }

        public QueryBuilder fetchPictureURL(){
            setFetchFields("fetchFields","pictureURL");
            return this;
        }

        public QueryBuilder excludePictureURL(){
            setFetchFields("excludeFields","pictureURL");
            return this;
        }

        public QueryBuilder fuzzyJumpURL (List<String> fuzzyJumpURL){
            this.fuzzyJumpURL = fuzzyJumpURL;
            return this;
        }

        public QueryBuilder fuzzyJumpURL (String ... fuzzyJumpURL){
            this.fuzzyJumpURL = solveNullList(fuzzyJumpURL);
            return this;
        }

        public QueryBuilder rightFuzzyJumpURL (List<String> rightFuzzyJumpURL){
            this.rightFuzzyJumpURL = rightFuzzyJumpURL;
            return this;
        }

        public QueryBuilder rightFuzzyJumpURL (String ... rightFuzzyJumpURL){
            this.rightFuzzyJumpURL = solveNullList(rightFuzzyJumpURL);
            return this;
        }

        public QueryBuilder jumpURL(String jumpURL){
            setJumpURL(jumpURL);
            return this;
        }

        public QueryBuilder jumpURLList(String ... jumpURL){
            this.jumpURLList = solveNullList(jumpURL);
            return this;
        }

        public QueryBuilder jumpURLList(List<String> jumpURL){
            this.jumpURLList = jumpURL;
            return this;
        }

        public QueryBuilder fetchJumpURL(){
            setFetchFields("fetchFields","jumpURL");
            return this;
        }

        public QueryBuilder excludeJumpURL(){
            setFetchFields("excludeFields","jumpURL");
            return this;
        }

        public QueryBuilder priceBetWeen(Double priceSt,Double priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(Double priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(Double priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(Double price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(Double ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<Double> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
            return this;
        }

        public QueryBuilder fuzzyInfo (List<String> fuzzyInfo){
            this.fuzzyInfo = fuzzyInfo;
            return this;
        }

        public QueryBuilder fuzzyInfo (String ... fuzzyInfo){
            this.fuzzyInfo = solveNullList(fuzzyInfo);
            return this;
        }

        public QueryBuilder rightFuzzyInfo (List<String> rightFuzzyInfo){
            this.rightFuzzyInfo = rightFuzzyInfo;
            return this;
        }

        public QueryBuilder rightFuzzyInfo (String ... rightFuzzyInfo){
            this.rightFuzzyInfo = solveNullList(rightFuzzyInfo);
            return this;
        }

        public QueryBuilder info(String info){
            setInfo(info);
            return this;
        }

        public QueryBuilder infoList(String ... info){
            this.infoList = solveNullList(info);
            return this;
        }

        public QueryBuilder infoList(List<String> info){
            this.infoList = info;
            return this;
        }

        public QueryBuilder fetchInfo(){
            setFetchFields("fetchFields","info");
            return this;
        }

        public QueryBuilder excludeInfo(){
            setFetchFields("excludeFields","info");
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

        public ItemDO build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> pictureURLList;

        public List<String> getPictureURLList(){return this.pictureURLList;}


        private List<String> fuzzyPictureURL;

        public List<String> getFuzzyPictureURL(){return this.fuzzyPictureURL;}

        private List<String> rightFuzzyPictureURL;

        public List<String> getRightFuzzyPictureURL(){return this.rightFuzzyPictureURL;}
        private List<String> jumpURLList;

        public List<String> getJumpURLList(){return this.jumpURLList;}


        private List<String> fuzzyJumpURL;

        public List<String> getFuzzyJumpURL(){return this.fuzzyJumpURL;}

        private List<String> rightFuzzyJumpURL;

        public List<String> getRightFuzzyJumpURL(){return this.rightFuzzyJumpURL;}
        private List<Double> priceList;

        public List<Double> getPriceList(){return this.priceList;}

        private Double priceSt;

        private Double priceEd;

        public Double getPriceSt(){return this.priceSt;}

        public Double getPriceEd(){return this.priceEd;}

        private List<String> infoList;

        public List<String> getInfoList(){return this.infoList;}


        private List<String> fuzzyInfo;

        public List<String> getFuzzyInfo(){return this.fuzzyInfo;}

        private List<String> rightFuzzyInfo;

        public List<String> getRightFuzzyInfo(){return this.rightFuzzyInfo;}

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

        public ConditionBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public ConditionBuilder fuzzyTitle (String ... fuzzyTitle){
            this.fuzzyTitle = solveNullList(fuzzyTitle);
            return this;
        }

        public ConditionBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public ConditionBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            this.rightFuzzyTitle = solveNullList(rightFuzzyTitle);
            return this;
        }

        public ConditionBuilder titleList(String ... title){
            this.titleList = solveNullList(title);
            return this;
        }

        public ConditionBuilder titleList(List<String> title){
            this.titleList = title;
            return this;
        }

        public ConditionBuilder fuzzyPictureURL (List<String> fuzzyPictureURL){
            this.fuzzyPictureURL = fuzzyPictureURL;
            return this;
        }

        public ConditionBuilder fuzzyPictureURL (String ... fuzzyPictureURL){
            this.fuzzyPictureURL = solveNullList(fuzzyPictureURL);
            return this;
        }

        public ConditionBuilder rightFuzzyPictureURL (List<String> rightFuzzyPictureURL){
            this.rightFuzzyPictureURL = rightFuzzyPictureURL;
            return this;
        }

        public ConditionBuilder rightFuzzyPictureURL (String ... rightFuzzyPictureURL){
            this.rightFuzzyPictureURL = solveNullList(rightFuzzyPictureURL);
            return this;
        }

        public ConditionBuilder pictureURLList(String ... pictureURL){
            this.pictureURLList = solveNullList(pictureURL);
            return this;
        }

        public ConditionBuilder pictureURLList(List<String> pictureURL){
            this.pictureURLList = pictureURL;
            return this;
        }

        public ConditionBuilder fuzzyJumpURL (List<String> fuzzyJumpURL){
            this.fuzzyJumpURL = fuzzyJumpURL;
            return this;
        }

        public ConditionBuilder fuzzyJumpURL (String ... fuzzyJumpURL){
            this.fuzzyJumpURL = solveNullList(fuzzyJumpURL);
            return this;
        }

        public ConditionBuilder rightFuzzyJumpURL (List<String> rightFuzzyJumpURL){
            this.rightFuzzyJumpURL = rightFuzzyJumpURL;
            return this;
        }

        public ConditionBuilder rightFuzzyJumpURL (String ... rightFuzzyJumpURL){
            this.rightFuzzyJumpURL = solveNullList(rightFuzzyJumpURL);
            return this;
        }

        public ConditionBuilder jumpURLList(String ... jumpURL){
            this.jumpURLList = solveNullList(jumpURL);
            return this;
        }

        public ConditionBuilder jumpURLList(List<String> jumpURL){
            this.jumpURLList = jumpURL;
            return this;
        }

        public ConditionBuilder priceBetWeen(Double priceSt,Double priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(Double priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(Double priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(Double ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<Double> price){
            this.priceList = price;
            return this;
        }

        public ConditionBuilder fuzzyInfo (List<String> fuzzyInfo){
            this.fuzzyInfo = fuzzyInfo;
            return this;
        }

        public ConditionBuilder fuzzyInfo (String ... fuzzyInfo){
            this.fuzzyInfo = solveNullList(fuzzyInfo);
            return this;
        }

        public ConditionBuilder rightFuzzyInfo (List<String> rightFuzzyInfo){
            this.rightFuzzyInfo = rightFuzzyInfo;
            return this;
        }

        public ConditionBuilder rightFuzzyInfo (String ... rightFuzzyInfo){
            this.rightFuzzyInfo = solveNullList(rightFuzzyInfo);
            return this;
        }

        public ConditionBuilder infoList(String ... info){
            this.infoList = solveNullList(info);
            return this;
        }

        public ConditionBuilder infoList(List<String> info){
            this.infoList = info;
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

        private ItemDO obj;

        public Builder(){
            this.obj = new ItemDO();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder title(String title){
            this.obj.setTitle(title);
            return this;
        }
        public Builder pictureURL(String pictureURL){
            this.obj.setPictureURL(pictureURL);
            return this;
        }
        public Builder jumpURL(String jumpURL){
            this.obj.setJumpURL(jumpURL);
            return this;
        }
        public Builder price(Double price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder info(String info){
            this.obj.setInfo(info);
            return this;
        }
        public ItemDO build(){return obj;}
    }

}
