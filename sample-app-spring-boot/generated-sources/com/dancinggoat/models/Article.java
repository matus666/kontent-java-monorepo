package com.dancinggoat.models;

import java.lang.String;
import java.time.ZonedDateTime;
import java.util.List;
import kentico.kontent.delivery.Asset;
import kentico.kontent.delivery.ContentItem;
import kentico.kontent.delivery.ContentItemMapping;
import kentico.kontent.delivery.ElementMapping;
import kentico.kontent.delivery.System;
import kentico.kontent.delivery.Taxonomy;

/**
 * This code was generated by a <a href="https://github.com/Kentico/cloud-generators-java">cloud-generators-java tool</a>
 *
 * Changes to this file may cause incorrect behavior and will be lost if the code is regenerated.
 * For further modifications of the class, create a separate file and extend this class.
 */
@ContentItemMapping("article")
public class Article {
  @ElementMapping("metadata__og_description")
  String metadataOgDescription;

  @ElementMapping("metadata__meta_title")
  String metadataMetaTitle;

  @ElementMapping("personas")
  List<Taxonomy> personas;

  @ElementMapping("body_copy")
  String bodyCopy;

  @ElementMapping("metadata__og_title")
  String metadataOgTitle;

  @ElementMapping("metadata__meta_description")
  String metadataMetaDescription;

  @ElementMapping("metadata__twitter_site")
  String metadataTwitterSite;

  @ElementMapping("post_date")
  ZonedDateTime postDate;

  @ElementMapping("meta_keywords")
  String metaKeywords;

  @ElementMapping("teaser_image")
  List<Asset> teaserImage;

  @ElementMapping("metadata__twitter_image")
  List<Asset> metadataTwitterImage;

  @ElementMapping("metadata__twitter_creator")
  String metadataTwitterCreator;

  @ElementMapping("title")
  String title;

  @ElementMapping("summary")
  String summary;

  @ElementMapping("sitemap")
  List<Taxonomy> sitemap;

  @ElementMapping("metadata__twitter_title")
  String metadataTwitterTitle;

  @ElementMapping("metadata__twitter_description")
  String metadataTwitterDescription;

  @ElementMapping("meta_description")
  String metaDescription;

  @ElementMapping("metadata__og_image")
  List<Asset> metadataOgImage;

  @ContentItemMapping("related_articles")
  List<ContentItem> relatedArticles;

  @ElementMapping("url_pattern")
  String urlPattern;

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

  public List<Taxonomy> getPersonas() {
    return personas;
  }

  public void setPersonas(List<Taxonomy> personas) {
    this.personas = personas;
  }

  public String getBodyCopy() {
    return bodyCopy;
  }

  public void setBodyCopy(String bodyCopy) {
    this.bodyCopy = bodyCopy;
  }

  public String getMetadataOgTitle() {
    return metadataOgTitle;
  }

  public void setMetadataOgTitle(String metadataOgTitle) {
    this.metadataOgTitle = metadataOgTitle;
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

  public ZonedDateTime getPostDate() {
    return postDate;
  }

  public void setPostDate(ZonedDateTime postDate) {
    this.postDate = postDate;
  }

  public String getMetaKeywords() {
    return metaKeywords;
  }

  public void setMetaKeywords(String metaKeywords) {
    this.metaKeywords = metaKeywords;
  }

  public List<Asset> getTeaserImage() {
    return teaserImage;
  }

  public void setTeaserImage(List<Asset> teaserImage) {
    this.teaserImage = teaserImage;
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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public List<Taxonomy> getSitemap() {
    return sitemap;
  }

  public void setSitemap(List<Taxonomy> sitemap) {
    this.sitemap = sitemap;
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

  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public List<Asset> getMetadataOgImage() {
    return metadataOgImage;
  }

  public void setMetadataOgImage(List<Asset> metadataOgImage) {
    this.metadataOgImage = metadataOgImage;
  }

  public List<ContentItem> getRelatedArticles() {
    return relatedArticles;
  }

  public void setRelatedArticles(List<ContentItem> relatedArticles) {
    this.relatedArticles = relatedArticles;
  }

  public String getUrlPattern() {
    return urlPattern;
  }

  public void setUrlPattern(String urlPattern) {
    this.urlPattern = urlPattern;
  }

  public System getSystem() {
    return system;
  }

  public void setSystem(System system) {
    this.system = system;
  }
}
