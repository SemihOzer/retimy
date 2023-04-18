package com.semihozer.retimy.service.abstracts;

import com.semihozer.retimy.entities.Photo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PhotoService {
    String addPhoto(MultipartFile file) throws IOException;
    Photo getPhotoById(String id);
    void deletePhotoById(String id);
}
