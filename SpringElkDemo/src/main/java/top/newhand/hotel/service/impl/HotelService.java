package top.newhand.hotel.service.impl;

import top.newhand.hotel.mapper.HotelMapper;
import top.newhand.hotel.pojo.Hotel;
import top.newhand.hotel.service.IHotelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelService extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {
}
