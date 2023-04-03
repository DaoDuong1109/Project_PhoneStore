$(document).ready(function () {
    $("#form_login").validate({
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
            email: {
                required: true,
                maxlength: 50,

            },
            password: {
                required: true,
                minlength: 8,
                maxlength: 32,
            },
            captcha: {
                required: true,
            }
        },
        messages: {
            email: {
                required: "Enter your email",
                maxlength: "Your email is more than 50 characters",

            },
            password: {
                required: "Enter your Password",
                minlength: "Must be 8-32 characters",
                maxlength: "Your password is more than 32 characters",
            },
            captcha: {
                required: "Enter Captcha",
            }
        },
    });

    $(document).onclick("#save", function () {
        let result = $("#form_login").valid();
        console.log(result);
    });
});