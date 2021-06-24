package com.test.performance.elasticsearch.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Document(indexName = "report")
public class Report {

    @JsonIgnore
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.S'Z'";

//    @Id
    protected String id;
    @Field(type = FieldType.Date, store = true, format = DateFormat.custom, pattern = DATE_FORMAT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date timestamp;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date date1;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date date2;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date date3;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date date4;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date date5;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date date6;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    protected Date date7;
//    @Indexed
    private String name;
    private String group;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private Long numeric1;
    private Long numeric2;
    private Long numeric3;
    private Long numeric4;
    private Long numeric5;
    private Long numeric6;
    private Long numeric7;
    private Long numeric8;
    private Double double1;
    private Double double2;
    private Double double3;
    private Double double4;
    private Double double5;
    private Double double6;
    private Double double7;
    private Double double8;
    private boolean enabled;
}
