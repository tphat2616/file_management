package com.mycompany.filemanagement.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Setting.class)
public abstract class Setting_ {

	public static volatile SingularAttribute<Setting, Integer> itemPerPage;
	public static volatile SingularAttribute<Setting, String> mimeTypeAllowed;
	public static volatile SingularAttribute<Setting, Integer> id;
	public static volatile SingularAttribute<Setting, Double> maxFileSize;
	public static volatile SingularAttribute<Setting, Date> lastUpdateTime;

}

