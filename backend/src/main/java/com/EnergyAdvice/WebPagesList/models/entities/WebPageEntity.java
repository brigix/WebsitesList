package com.EnergyAdvice.WebPagesList.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WEBPAGES")
public class WebPageEntity extends AbstractEntity {

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "url")
    private String url;

    @Column(name ="logo")
    private String logo;

}
