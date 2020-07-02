package com.dancinggoat.models;

import java.lang.Double;
import java.lang.String;
import java.lang.System;
import java.util.List;
import kentico.kontent.delivery.Asset;
import kentico.kontent.delivery.ContentItemMapping;
import kentico.kontent.delivery.ElementMapping;
import kentico.kontent.delivery.Taxonomy;

/**
 * This code was generated by a <a href="https://github.com/Kentico/cloud-generators-java">cloud-generators-java tool</a>
 *
 * Changes to this file may cause incorrect behavior and will be lost if the code is regenerated.
 * For further modifications of the class, create a separate file and extend this class.
 */
@ContentItemMapping("accessory")
public class Accessory {
  @ElementMapping("metadata__og_description")
  String metadataOgDescription;

  @ElementMapping("metadata__meta_title")
  String metadataMetaTitle;

  @ElementMapping("metadata__og_title")
  String metadataOgTitle;

  @ElementMapping("long_description")
  String longDescription;

  @ElementMapping("metadata__meta_description")
  String metadataMetaDescription;

  @ElementMapping("metadata__twitter_site")
  String metadataTwitterSite;

  @ElementMapping("price")
  Double price;

  @ElementMapping("metadata__twitter_image")
  List<Asset> metadataTwitterImage;

  @ElementMapping("metadata__twitter_creator")
  String metadataTwitterCreator;

  @ElementMapping("url_pattern")
  String urlPattern;

  @ElementMapping("short_description")
  String shortDescription;

  @ElementMapping("manufacturer")
  String manufacturer;

  @ElementMapping("metadata__twitter_title")
  String metadataTwitterTitle;

  @ElementMapping("metadata__twitter_description")
  String metadataTwitterDescription;

  @ElementMapping("metadata__og_image")
  List<Asset> metadataOgImage;

  @ElementMapping("sitemap")
  List<Taxonomy> sitemap;

  @ElementMapping("product_status")
  List<Taxonomy> productStatus;

  @ElementMapping("image")
  List<Asset> image;

  @ElementMapping("product_name")
  String productName;

  System system;

  public String getMetadataOgDescription() {
    return metadataOgDescription;
  }

  public void setMetadataOgDescription(String metadataOgDescription) {
    this.metadataOgDescription = metadataOgDescription;
  }

  public String getMetadataMetaTitle() {
    return metadataMetaTitle;
  }

  public void setMetadataMetaTitle(String metadataMetaTitle) {
    this.metadataMetaTitle = metadataMetaTitle;
  }

  public String getMetadataOgTitle() {
    return metadataOgTitle;
  }

  public void setMetadataOgTitle(String metadataOgTitle) {
    this.metadataOgTitle = metadataOgTitle;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public String getMetadataMetaDescription() {
    return metadataMetaDescription;
  }

  public void setMetadataMetaDescription(String metadataMetaDescription) {
    this.metadataMetaDescription = metadataMetaDescription;
  }

  public String getMetadataTwitterSite() {
    return metadataTwitterSite;
  }

  public void setMetadataTwitterSite(String metadataTwitterSite) {
    this.metadataTwitterSite = metadataTwitterSite;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public List<Asset> getMetadataTwitterImage() {
    return metadataTwitterImage;
  }

  public void setMetadataTwitterImage(List<Asset> metadataTwitterImage) {
    this.metadataTwitterImage = metadataTwitterImage;
  }

  public String getMetadataTwitterCreator() {
    return metadataTwitterCreator;
  }

  public void setMetadataTwitterCreator(String metadataTwitterCreator) {
    this.metadataTwitterCreator = metadataTwitterCreator;
  }

  public String getUrlPattern() {
    return urlPattern;
  }

  public void setUrlPattern(String urlPattern) {
    this.urlPattern = urlPattern;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getMetadataTwitterTitle() {
    return metadataTwitterTitle;
  }

  public void setMetadataTwitterTitle(String metadataTwitterTitle) {
    this.metadataTwitterTitle = metadataTwitterTitle;
  }

  public String getMetadataTwitterDescription() {
    return metadataTwitterDescription;
  }

  public void setMetadataTwitterDescription(String metadataTwitterDescription) {
    this.metadataTwitterDescription = metadataTwitterDescription;
  }

  public List<Asset> getMetadataOgImage() {
    return metadataOgImage;
  }

  public void setMetadataOgImage(List<Asset> metadataOgImage) {
    this.metadataOgImage = metadataOgImage;
  }

  public List<Taxonomy> getSitemap() {
    return sitemap;
  }

  public void setSitemap(List<Taxonomy> sitemap) {
    this.sitemap = sitemap;
  }

  public List<Taxonomy> getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(List<Taxonomy> productStatus) {
    this.productStatus = productStatus;
  }

  public List<Asset> getImage() {
    return image;
  }

  public void setImage(List<Asset> image) {
    this.image = image;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public System getSystem() {
    return system;
  }

  public void setSystem(System system) {
    this.system = system;
  }
}
