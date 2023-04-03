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
                required: "Enter your user name",
                maxlength: "Your first name is more than 50 characters",
            },
            email: {
                required: "Enter your email",
                maxlength: "Your email is more than 50 characters",
            },
            password: {
                required: "Enter your Password",
                maxlength: "Your password is more than 32 characters",
            },
            confirmPassword: {
                required: "Enter your Password again",
                maxlength: "Your password is more than 32 characters",
                equalTo: "Please enter password the same as above",
            },
        },
    });

    $(document).on("click", "#save", function () {
        let result = $("#register").valid();
        console.log(result);
    });
});
