$(document).ready(function () {
    $("#register").validate({
        errorClass: "error-class",
        validClass: "valid-class",
        errorElement: "div",
        errorPlacement: function (error, element) {
            if (element.parent(".input-group").length) {
                error.insertAfter(element.parent());
            } else {
                error.insertAfter(element);
            }
        },
        onError: function () {
            $(".input-group.error-class")
                    .find(".help-block.form-error")
                    .each(function () {
                        $(this).closest(".form-group").addClass("error-class").append($(this));
                    });
        },
        rules: {
            userName: {
                required: true,
                maxlength: 50,
            },
            email: {
                required: true,
                maxlength: 50,
                email: true,
            },
            password: {
                required: true,
                maxlength: 32,
            },
            confirmPassword: {
                required: true,
                maxlength: 32,
                equalTo: "#password",
            },

        },
        messages: {

            userName: {
                required: "Nhập tên người dùng",
                maxlength: "Độ dài tối đa 50 ký tự",
            },
            email: {
                required: "Nhập Email",
                maxlength: "Độ dài tối đa 50 ký tự",
            },
            password: {
                required: "Nhập mật khẩu",
                maxlength: "Độ dài tối đa 32 ký tự",
            },
            confirmPassword: {
                required: "Nhập xác nhận mật khẩu",
                maxlength: "Độ dài tối đa 32 ký tự",
                equalTo: "Không trùng lặp với mật khẩu đã nhập",
            },
        },
    });

    $(document).on("click", "#save", function () {
        let result = $("#register").valid();
        console.log(result);
    });
});
