package com.betrybe.agrix.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import  jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/** Esta classe representa uma entidade de fazenda. */
@Entity
@Table(name = "farms")
public class Farms {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double size;

  @OneToMany(mappedBy = "farms")
  @JsonIgnore
  private List<Crop> crops;

  public Farms() {}

  /**
   * Construtor da classe Farms.
   *
   * @param id   O identificador da fazenda.
   * @param name O nome da fazenda.
   * @param size O tamanho da fazenda.
   */
  public Farms(Long id, String name, Double size) {
    this.id = id;
    this.name = name;
    this.size = size;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getSize() {
    return size;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSize(Double size) {
    this.size = size;
  }

  public List<Crop> getCrops() {
    return crops;
  }

  public void setCrops(List<Crop> crops) {
    this.crops = crops;
  }
}

