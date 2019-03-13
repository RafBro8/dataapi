package com.alpha.dataapi.controller;

import com.alpha.dataapi.model.DataModel;
import com.alpha.dataapi.service.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(MockitoJUnitRunner.class)
public class DataControllerTest {

    @InjectMocks
    private DataController dataController;

    @Mock
    private DataService dataService;

    private MockMvc mockMvc;


    @Test
    public void getData_shouldDelegateToService() {
         dataController.getData();

         Mockito.verify(dataService).retrieveAllData();
    }

    @Test
    public void postData_shouldDelegateToService() {
        DataModel mockDataModel = DataModel.builder()
                .age(35)
                .name("Rafal")
                .profession("Software Engineer")
                .build();
        dataController.postData();

        Mockito.verify(dataService).saveData(mockDataModel);
    }

    //    @Test
//    public void getData_shouldReturn200Response() throws Exception {
//        mockMvc.perform(get("/api/data/allData"))
//                .andExpect(status().isOk());
//    }
}