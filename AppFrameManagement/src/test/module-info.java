module AppFrameManagement {
    requires ComputingManagement; // Access to Computing
    requires ButtonPanelManagement; // Access to ButtonPanel
    requires FormPanelManagement; // Access to FormPanel
    requires InfoPanelManagement; // Access to InfoPanel
    requires ListPanelManagement;

    exports org.example;
}