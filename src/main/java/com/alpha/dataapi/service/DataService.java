package com.alpha.dataapi.service;

import com.alpha.dataapi.model.DataModel;
import com.alpha.dataapi.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public DataModel retrieveAllData() {
        return null;
    }

    public DataModel saveData(DataModel dataModel) {
       return dataRepository.save(dataModel);

    }

    public Set<String> setData(String set1, String set2, String set3) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add(set1);
        stringSet.add(set2);
        stringSet.add(set3);

        return stringSet;
    }

    public Set<String> setAlphabeticalData(String aaa, String bbb, String ccc, String ddd) {
        Set<String> alphaStringSet = new TreeSet<>();
        alphaStringSet.add(aaa);
        alphaStringSet.add(bbb);
        alphaStringSet.add(ccc);
        alphaStringSet.add(ddd);

        return alphaStringSet;
    }

    public Object practiceCoding() {

        int [] someArr = {1,2,3};

        return someArr;
    }
}
