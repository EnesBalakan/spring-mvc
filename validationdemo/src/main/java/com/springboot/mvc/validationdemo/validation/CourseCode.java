
// Bu sınıfın amacı @CourseCode anotasyonu oluşturup bir alanın "ogr" ile başlayıp
// başlamadığını kontrol etmek için özel bir doğrulayıcı tanımlamaktır

package com.springboot.mvc.validationdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Bu, anotasyonun doğrulayıcısının hangi sınıf olduğunu belirtir
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
// Bu anotasyonun nerede kullanılabileceğini belirtir.
@Target({ElementType.METHOD, ElementType.FIELD})
// Bu anotasyonun çalışma zamanında da aktif olmasını sağlar.
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    // Başlamasını istediğimiz değerleri buraya gireriz.
    // define default course code
    public String value() default "ogr";

    // doğrulama başarısız olduğunda gösterilecek hata mesajı
    // define default error message
    public String message() default "must start with ogr";

    // Validasyon grupları için kullanılır (ileri seviye kullanımlar için)
    //define default groups
    public Class<?>[] groups() default {};

    // Ek meta veriler eklemek için kullanılır (çoğu zaman boş bırakılır)
    // define default payloads
    public Class<? extends Payload>[] payload() default {};
}
