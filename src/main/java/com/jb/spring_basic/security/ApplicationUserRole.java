package com.jb.spring_basic.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.jb.spring_basic.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    ADMIN(Sets.newHashSet(ADMIN_READ,ADMIN_WRITE,COMPANY_READ,COMPANY_WRITE,CUSTOMER_READ,CUSTOMER_WRITE,COUPON_READ)),
    COMPANY(Sets.newHashSet(COMPANY_READ,COMPANY_WRITE,CUSTOMER_READ,COUPON_READ,COUPON_WRITE)),
    CUSTOMER(Sets.newHashSet(COUPON_READ,COUPON_WRITE)),
    GUEST(Sets.newHashSet(COUPON_READ)),
    SUPPORT(Sets.newHashSet(ADMIN_READ,COMPANY_READ,CUSTOMER_READ,COUPON_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions){
        this.permissions=permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission-> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        return permissions;
    }
}
