package com.example.aispringboot.service.convert;

import com.example.aispringboot.DTO.response.UserLoginResponseDTO;
import com.example.aispringboot.entity.User;

public class UserConvert {
    // 构建相应DTO
    public static UserLoginResponseDTO.UserDetailResponseDTO(
    User user) {
        return UserLoginResponseDTO.UserDetailResponseDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .nickname(user.getNickname())
                .avatar(user.getAvatar())
                .phone(user.getPhone())
                .gender(user.getGender())
                .birthday(user.getBirthday())
                .userType(user.getUserType())
                .userTypeDisplayName(user.getUser)
                .status(user.getStatus())
                .displayName(user.getDisplayName())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }

    /**
     * 获取性别显示名称
     * @param gender 性别代码
     * @return 性别显示名称
     */
    private static String getGenderDisplayName(Integer gender) {
        if (gender == null) {
            return "未知";
        }
        return switch (gender) {
            case 1 -> "男";
            case 2 -> "女";
            default -> "未知";
        };
    }
}
