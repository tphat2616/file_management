package com.mycompany.filemanagement.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(File.class)
public abstract class File_ {

	public static volatile SingularAttribute<File, String> path;
	public static volatile SingularAttribute<File, Date> createdDate;
	public static volatile SingularAttribute<File, Double> fileSize;
	public static volatile SingularAttribute<File, Integer> numOfDownload;
	public static volatile SingularAttribute<File, String> mime;
	public static volatile SingularAttribute<File, String> name;
	public static volatile SingularAttribute<File, String> versionlds;
	public static volatile SingularAttribute<File, Integer> id;
	public static volatile SingularAttribute<File, Integer> version;
	public static volatile SingularAttribute<File, Boolean> status;

}

