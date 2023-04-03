package com.example.demo.entity;

import jakarta.persistence.*;


import java.util.Objects;

@Entity
@Table(name = "product", schema = "phone_store", catalog = "")
public class ProductEntity {
    @Basic
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "image")
    private String image;
    @Basic
    @Column(name = "screen")
    private String screen;
    @Basic
    @Column(name = "operating_system")
    private String operatingSystem;
    @Basic
    @Column(name = "front_camera")
    private String frontCamera;
    @Basic
    @Column(name = "rear_camera")
    private String rearCamera;
    @Basic
    @Column(name = "CPU")
    private String cpu;
    @Basic
    @Column(name = "RAM")
    private String ram;
    @Basic
    @Column(name = "inside_memory")
    private String insideMemory;
    @Basic
    @Column(name = "memory_card")
    private String memoryCard;
    @Basic
    @Column(name = "battery")
    private String battery;
    @Basic
    @Column(name = "trending")
    private Boolean trending;
    @Basic
    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private CategoryEntity categoryEntity;
    @Basic
    @Column(name = "status")
    private Boolean status;

public ProductEntity(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getRearCamera() {
        return rearCamera;
    }

    public void setRearCamera(String rearCamera) {
        this.rearCamera = rearCamera;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getInsideMemory() {
        return insideMemory;
    }

    public void setInsideMemory(String insideMemory) {
        this.insideMemory = insideMemory;
    }

    public String getMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(String memoryCard) {
        this.memoryCard = memoryCard;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public Boolean getTrending() {
        return trending;
    }

    public void setTrending(Boolean trending) {
        this.trending = trending;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(image, that.image) && Objects.equals(screen, that.screen) && Objects.equals(operatingSystem, that.operatingSystem) && Objects.equals(frontCamera, that.frontCamera) && Objects.equals(rearCamera, that.rearCamera) && Objects.equals(cpu, that.cpu) && Objects.equals(ram, that.ram) && Objects.equals(insideMemory, that.insideMemory) && Objects.equals(memoryCard, that.memoryCard) && Objects.equals(battery, that.battery) && Objects.equals(trending, that.trending) && Objects.equals(categoryEntity, that.categoryEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image, screen, operatingSystem, frontCamera, rearCamera, cpu, ram, insideMemory, memoryCard, battery, trending, categoryEntity);
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCategoryId() {
        return categoryEntity.getId();
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryEntity = categoryEntity;
    }
}
