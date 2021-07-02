<?php

$err = array();
$data = array();


if (empty($_POST['email'])) {
    $err['email'] = 'Email is required.';
    http_response_code(400);
} else if (!filter_var($_POST['email'], FILTER_VALIDATE_EMAIL)) {
    $err['email'] = "Invalid email format";
    http_response_code(400);
}

if (!empty($err)) {
    $data['success'] = false;
    $data['err']  = $err;
} else {
    $data['success'] = true;
    $data['message'] = 'Success!';
    $data['email'] = $_POST['email'];
}
echo json_encode($data);
?>