package ru.mityugov.avogoodsaccounting.status.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mityugov.avogoodsaccounting.status.repository.StatusRepository;
import ru.mityugov.avogoodsaccounting.status.repository.entity.StatusEntity;
import ru.mityugov.avogoodsaccounting.status.service.StatusService;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;

    @Override
    public List<String> get() {
        List<String> statusesString = new ArrayList<>();
        List<StatusEntity> statuses = statusRepository.get();
        for (StatusEntity s : statuses) {
            statusesString.add(s.getStatus());
        }
        return statusesString;
    }
}
