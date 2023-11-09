package com.ewallet.demo.Service;

import com.ewallet.demo.Authentication.WalletUserDetails;
import com.ewallet.demo.Model.UserAuth;
import com.ewallet.demo.Repository.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class WalletUserDetailsService implements UserDetailsService {

    @Autowired
    private UserAuthRepository userAuthRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        UserAuth userAuth = userAuthRepository.findByUsername(username);
        if(userAuth==null){
            throw new UsernameNotFoundException("User not found with username"+username);
        }
        return new WalletUserDetails(userAuth);
    }
}
