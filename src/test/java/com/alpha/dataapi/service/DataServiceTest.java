package com.alpha.dataapi.service;


import com.alpha.dataapi.model.DataModel;
import com.alpha.dataapi.repository.DataRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class DataServiceTest {

    @InjectMocks
    private DataService dataService;

    @Mock
    private DataRepository dataRepository;

    @Test
    public void saveData_shouldDelegateToRepository() {

        DataModel mockDataModel = DataModel.builder()
                .age(35)
                .name("Rafal")
                .profession("Software Engineer")
                .build();
        dataService.saveData(mockDataModel);

        Mockito.verify(dataRepository).save(mockDataModel);
    }

    @Test
    public void setData_shouldReturnSomeData() {
        Set<String> actualStringSet = dataService.setData("Set1", "Set2", "Set3");
        Set<String> expectedStringSet = new HashSet<>();
        expectedStringSet.add("Set1");
        expectedStringSet.add("Set2");
        expectedStringSet.add("Set3");

        assertThat(actualStringSet).isEqualTo(expectedStringSet);

    }

    @Test
    public void setAlphabeticalData_shouldReturnDataInAlphabeticalOrder() {
        Set<String> actualAlphaStringSet = dataService.setAlphabeticalData("Aaa", "Bbb", "Ccc", "Ddd");
        Set<String> expectedAlphaStringSet = new HashSet<>();
        expectedAlphaStringSet.add("Ccc");
        expectedAlphaStringSet.add("Bbb");
        expectedAlphaStringSet.add("Aaa");
        expectedAlphaStringSet.add("Ddd");

        assertThat(actualAlphaStringSet).isEqualTo(expectedAlphaStringSet);

    }
}