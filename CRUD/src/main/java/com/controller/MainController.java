package com.controller;
import com.SaveModel.DeleteEmployeeMethod;
import com.SaveModel.EditEmployeeRecord;
import com.SaveModel.SaveModel;
import com.SaveModel.ViewEmployeeListModel;
import com.entity.User;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController 
{
    @RequestMapping(value="/")
    public String index()
    {
        return "index";
    }
    @RequestMapping(value="empform",method=RequestMethod.GET)
    public String employeeform()
    {
        return "employeeform";
    }
    
    @RequestMapping(value="save",method=RequestMethod.POST)
    public String InsertEmployeeRecord(@ModelAttribute(value="User") User user)
    {
        System.out.println("Before create object");
        SaveModel model=new SaveModel();
        boolean check=model.EmployeeInsert(user);
        if(check==true) return"index";
        else return "inseterror";
    }
    
    @RequestMapping(value="viewemp")
    public String ViewEmployeeList(ModelMap m)
    {
        ViewEmployeeListModel model=new ViewEmployeeListModel();
        List list=model.ViewEmployee();
        m.addAttribute("elist",list);
       return "employeelist" ;
    }
    @RequestMapping(value="editemp",method=RequestMethod.GET)
    public String editemployee(@RequestParam(value="id")int id,Model m)
    {
        EditEmployeeRecord model=new EditEmployeeRecord();
        User check= model.EditEmployee(id);
        System.out.println("check : "+check.getDesignation());
       //if(check==true)return "employeeform";
       m.addAttribute("user", check);
       return "editemployeerecord";
    }
    @RequestMapping(value="Edit",method=RequestMethod.POST)
    public String updateEmployeeRecord(@ModelAttribute(value="User") User user,Model m)
    {
        System.out.println("Id : "+user.getId());
        EditEmployeeRecord model=new EditEmployeeRecord();
        model.UpdateEmployee(user);
        
        
         ViewEmployeeListModel model1=new ViewEmployeeListModel();
        List list=model1.ViewEmployee();
        m.addAttribute("elist",list);
        
        
        return "employeelist";
    }
    
    
    @RequestMapping(value="deleteemp",method=RequestMethod.GET)
    public String DeleteEmployeeRecord(@RequestParam(value="id")int id,Model m)
    {
        EditEmployeeRecord model=new EditEmployeeRecord();
        User check= model.EditEmployee(id);
        DeleteEmployeeMethod model2=new DeleteEmployeeMethod();
        model2.DeleteEmployeeMethod(check);
        ViewEmployeeListModel model1=new ViewEmployeeListModel();
        List list=model1.ViewEmployee();
        m.addAttribute("elist",list);
        return "employeelist";
    }
    
    
}
