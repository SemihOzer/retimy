package com.semihozer.retimy.service.concretes;

import com.semihozer.retimy.entities.Photo;
import com.semihozer.retimy.repositories.PhotoRepository;
import com.semihozer.retimy.service.abstracts.PhotoService;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class PhotoServiceImpl implements PhotoService {

    private PhotoRepository photoRepository;

    public PhotoServiceImpl(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public String addPhoto(MultipartFile file) throws IOException {
        Photo photo = new Photo();
        photo.setImage(
                new Binary(BsonBinarySubType.BINARY, file.getBytes())
        );
        photo = photoRepository.insert(photo);
        return photo.getId();
    }

    @Override
    public Photo getPhotoById(String id) {
        return photoRepository.findById(id).get();
    }

    @Override
    public void deletePhotoById(String id) {
        photoRepository.deleteById(id);
    }
}
