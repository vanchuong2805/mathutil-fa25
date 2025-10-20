package com.vanchuong.mathutil.core;

public class MathUtility {
    //class này chứa các hàm tiện ích dùng cho mọi nơi
    // hàm tiện ích dùng cho mọi nơi có nghĩa là không lưu lại kq xử lí bên trong => static method

    // hàm tính n giai thừa
    // 20! vừa đủ kiều long, 21! tràn long
    // không có âm giai thừa
    // bài này gia thừa chỉ tính 0 - 20  (valid boundary)
    // xích qua boundary value là sang vùng invalid boundary
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            // quăng exception và dùng hàm
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
        if (n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
