package com.team.shopping.Domains;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductTag is a Querydsl query type for ProductTag
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductTag extends EntityPathBase<ProductTag> {

    private static final long serialVersionUID = 81811596L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductTag productTag = new QProductTag("productTag");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QProduct product;

    public final QTag tag;

    public QProductTag(String variable) {
        this(ProductTag.class, forVariable(variable), INITS);
    }

    public QProductTag(Path<? extends ProductTag> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductTag(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductTag(PathMetadata metadata, PathInits inits) {
        this(ProductTag.class, metadata, inits);
    }

    public QProductTag(Class<? extends ProductTag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
        this.tag = inits.isInitialized("tag") ? new QTag(forProperty("tag"), inits.get("tag")) : null;
    }

}

