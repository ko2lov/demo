package com.example.demo.Model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Книга")
public class Data {
    @Schema(description = "Айдиник", example = "1")
    public int id;
    @Schema(description = "Название", example = "А зори здесь тихие")
    public String name_book;
    @Schema(description = "Описание", example = "О войне")
    public String description;
}