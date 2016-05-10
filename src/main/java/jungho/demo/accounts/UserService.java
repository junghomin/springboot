package jungho.demo.accounts;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Jungho on 2016-05-10.
 */
@Service
public class UserService {
    @Autowired
    private ModelMapper modelMapper;

    public User createUser(UserDto.Create dto) {
        User user = modelMapper.map(dto, User.class);

        String username = dto.getUsername();
//        if (repository.findByUsername(username) != null) {
//            log.error("user duplicated exception. {}", username);
//            throw new UserDuplicatedException(username);
//        }

        user.setPassword(user.getPassword());

        Date now = new Date();
        user.setJoined(now);
        user.setUpdated(now);
        return user;
    }

//    public Account updateAccount(Long id, AccountDto.Update updateDto) {
//        Account account = getAccount(id);
//        account.setPassword(passwordEncoder.encode(account.getPassword()));
//        account.setFullName(updateDto.getFullName());
//        return repository.save(account);
//    }
//
//    public Account getAccount(Long id) {
//        Account account = repository.findOne(id);
//        if (account == null) {
//            throw new AccountNotFoundException(id);
//        }
//        return account;
//    }
}
