package com.alpha.dataapi.controller;

import com.alpha.dataapi.model.DataModel;
import com.alpha.dataapi.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/allData")
    public DataModel getData() {

        return dataService.retrieveAllData();
    }

    @PostMapping("/savedData")
    public DataModel postData() {
        return dataService.saveData(DataModel.builder().build());
    }
}
