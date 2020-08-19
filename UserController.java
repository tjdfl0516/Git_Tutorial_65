@Controller
public class UserController

 // 로그인 페이지로 이동
 @RequestMapping("/user/login")
 public String login() {
   logger.info("경로 : login")

   return "user/login";
 }

 // 회원가입 페이지로 이동
 @RequestMapping("/user/insert")
 public String insert() {
   logger.info("경로 : insert")

   return "user/insert";
 }

 // 회원수정 페이지로 이동 
 @RequestMapping("/user/update")
 public String update() {
   logger.info("경로 : update")

   return "user/update";
 }

 // 회원 탈퇴시 회원 세션 정보 삭제
 // 회원삭제 페이지로 이동
 @RequestMapping("/user/delete")
 public String delete() {
   logger.info("경로 : delete")

   return "user/delete";
 }
}