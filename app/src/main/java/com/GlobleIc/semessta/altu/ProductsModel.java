package com.GlobleIc.semessta.altu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductsModel {


    @Expose
    @SerializedName("filter_productcategory")
    private String filter_productcategory;
    @Expose
    @SerializedName("special_from_date")
    private String special_from_date;
    @Expose
    @SerializedName("new_to_date")
    private String new_to_date;
    @Expose
    @SerializedName("new_from_date")
    private String new_from_date;
    @Expose
    @SerializedName("short_description")
    private String short_description;
    @Expose
    @SerializedName("description")
    private String description;
    @Expose
    @SerializedName("thumbnail_image")
    private String thumbnail_image;
    @Expose
    @SerializedName("small_image")
    private String small_image;
    @Expose
    @SerializedName("base_image")
    private String base_image;
    @Expose
    @SerializedName("sku")
    private String sku;
    @Expose
    @SerializedName("url_path")
    private String url_path;
    @Expose
    @SerializedName("product_url_path")
    private String product_url_path;
    @Expose
    @SerializedName("special_price")
    private String special_price;
    @Expose
    @SerializedName("pprice")
    private String pprice;
    @Expose
    @SerializedName("pname")
    private String pname;
    @Expose
    @SerializedName("pcat_id")
    private boolean pcat_id;
    @Expose
    @SerializedName("pid")
    private String pid;

    public String getFilter_productcategory() {
        return filter_productcategory;
    }

    public void setFilter_productcategory(String filter_productcategory) {
        this.filter_productcategory = filter_productcategory;
    }

    public String getSpecial_from_date() {
        return special_from_date;
    }

    public void setSpecial_from_date(String special_from_date) {
        this.special_from_date = special_from_date;
    }

    public String getNew_to_date() {
        return new_to_date;
    }

    public void setNew_to_date(String new_to_date) {
        this.new_to_date = new_to_date;
    }

    public String getNew_from_date() {
        return new_from_date;
    }

    public void setNew_from_date(String new_from_date) {
        this.new_from_date = new_from_date;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail_image() {
        return thumbnail_image;
    }

    public void setThumbnail_image(String thumbnail_image) {
        this.thumbnail_image = thumbnail_image;
    }

    public String getSmall_image() {
        return small_image;
    }

    public void setSmall_image(String small_image) {
        this.small_image = small_image;
    }

    public String getBase_image() {
        return base_image;
    }

    public void setBase_image(String base_image) {
        this.base_image = base_image;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getUrl_path() {
        return url_path;
    }

    public void setUrl_path(String url_path) {
        this.url_path = url_path;
    }

    public String getProduct_url_path() {
        return product_url_path;
    }

    public void setProduct_url_path(String product_url_path) {
        this.product_url_path = product_url_path;
    }

    public String getSpecial_price() {
        return special_price;
    }

    public void setSpecial_price(String special_price) {
        this.special_price = special_price;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public boolean getPcat_id() {
        return pcat_id;
    }

    public void setPcat_id(boolean pcat_id) {
        this.pcat_id = pcat_id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
